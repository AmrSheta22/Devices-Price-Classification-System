import requests
import pandas as pd
# URL of the Flask API
url = 'http://127.0.0.1:5000/predict'

# json payload with the dataframe columns as the keys
df = pd.read_csv("../data/test.csv")
predictions = []
for i in df.iterrows():
    payload = {
        "battery_power": i[1]['battery_power'],
        "blue": i[1]['blue'],
        "clock_speed": i[1]['clock_speed'],
        "dual_sim": i[1]['dual_sim'],
        "fc": i[1]['fc'],
        "four_g": i[1]['four_g'],
        "int_memory": i[1]['int_memory'],
        "m_dep": i[1]['m_dep'],
        "mobile_wt": i[1]['mobile_wt'],
        "n_cores": i[1]['n_cores'],
        "pc": i[1]['pc'],
        "px_height": i[1]['px_height'],
        "px_width": i[1]['px_width'],
        "ram": i[1]['ram'],
        "sc_h": i[1]['sc_h'],
        "sc_w": i[1]['sc_w'],
        "talk_time": i[1]['talk_time'],
        "three_g": i[1]["three_g"],
        "touch_screen": i[1]['touch_screen'],
        "wifi": i[1]['wifi']
    }
    response = requests.post(url, json=payload)
    if response.status_code == 200:
        predictions.append(response.json()['prediction'])
    else:
        print('Error:', response.json())
df["price_range_predicted"] = predictions
print(df[["id", "price_range_predicted"]].head(10))
df.to_csv("../data/test_predicted.csv", index=False)

