import cv2
import pytesseract

TESSERACT_PATH = r'C:\Users\jadaf\AppData\Local\Tesseract-OCR\tesseract.exe'
IMG_PATH = "C:\\Users\\jadaf\\Downloads\\testimage.jpg"

pytesseract.pytesseract.tesseract_cmd = TESSERACT_PATH
img = cv2.imread(IMG_PATH)

text = pytesseract.image_to_string(img)
print(text)
