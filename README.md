# blueprint2020
The Spiciest Meme Bot

Non-ML (Java) version:
- Resources:
httpsexamples.javacodegeeks.comdesktop-javaimageiocreate-image-file-from-graphics-object  - on how to draw on images

We used the following libraries to code our NON-AI version of the program

java.io.
java.util.
java.awt.image.BufferedImage;
javax.imageio.ImageIO;
java.awt.Graphics2D;
java.awt.Color;
java.awt.Font;

httpswww.autohotkey.com 
This software was used to make an auto-twitter-posting program
We used software called Sharex to find the pixels for the AHK program

Twitter
	-We used twitter to post our spicy memes
 
RedditThe Rest of the internet
For our memes
Memes are not copyrighted and are fair use


Machine Learning (Python) version:
This version of the code imports various libraries to scrape memes from the subreddit r/memes, read the words from within the images, train a machine learning model on the words, and generate new captions for memes. (We did not have time to add the captions back on to images)

Resources Used/Imported:
- PRAW (to scrape memes from Reddit)
- OpenCV (to read words from within images)
- GPT2-Simple (to train the language model and generate captions -- not only did we use this library, we learned how to do so by looking at the examples on the Github repo (https://github.com/minimaxir/gpt-2-simple) 
- Google Colaboratory (to increase the speed of training)
- Better Profanity (to censor inappropriate words from the memes)
- JSON Requests

Link to Working Version of ML Model:
https://colab.research.google.com/drive/1cxa_ANrbskhSsMySbulFctl2K5PT7yse

