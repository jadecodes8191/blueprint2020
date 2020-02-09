import requests
import praw
import shutil
import cv2
import pytesseract

TESSERACT_PATH = r"C:\Program Files\Tesseract-OCR\tesseract.exe"
IMG_PATH = r"C:\Users\jacksonmerg\Desktop\memes\code\file.jpg"


file=open(IMG_PATH, 'wb+')
file2=open("dataset.txt","a+")
reddit = praw.Reddit(client_id='FOEla3xjFOCxmQ',
                     client_secret='lOdapodqo1swz81g4FpP5_nCsUM',
                     user_agent='spicymemelord')
memes=reddit.subreddit("memes")
for meme in memes.new():
	if not meme.is_self:
		resp = requests.get(meme.url, stream=True)
		file=open(IMG_PATH, 'wb+')
		if resp.ok:
			resp.raw.decode_content=True
			shutil.copyfileobj(resp.raw,file)
			pytesseract.pytesseract.tesseract_cmd = TESSERACT_PATH
			img = cv2.imread(IMG_PATH)
			text=pytesseract.image_to_string(img)
			print("<|startoftext|>"+text+"<|endoftext|>")
			del img
		file.close()