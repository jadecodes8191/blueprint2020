import cv2
import pytesseract

TESSERACT_PATH = ""
IMG_PATH = ""

pytesseract.pytesseract.tesseract_cmd = TESSERACT_PATH
img = cv2.imread(IMG_PATH)

text = pytesseract.image_to_string(img)
print(text