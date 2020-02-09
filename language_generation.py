import gpt_2_simple as gpt2s
import os
import requests

meme_model = "124M"
gpt2s.download_gpt2(model_name=meme_model)
extracted_text = "extracted_text.txt"
session = gpt2s.start_tf_sess()
gpt2s.finetune(session, extracted_text, meme_model, steps=100)
txt_list = gpt2s.generate(session, temperature=0.7, return_as_list=True)
print(txt_list)
