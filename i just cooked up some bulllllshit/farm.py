import minescript
import time
import asyncio
pos = minescript.player_position()
pos2 = minescript.player_position() 
dodo = "s"
pos3 = "son"

def movefowardlol():
    minescript.player_press_forward(True)
    while True:
        pos = minescript.player_position()
        time.sleep(0.1)
        pos2 = minescript.player_position()
        if pos2 == pos:
            minescript.player_press_forward(False)
            pos3 = minescript.player_position()
          #  with open("config2.txt", "r") as file:
            #    readme = file.readlines()
            #strs = str(pos3[2])
            #readme[1] = strs
            ##  file.writelines("\n")
             #   file.writelines(readme)
            if dodo == "left":
                moveleftlol()
            elif dodo == "right":
                moverightlol()
            
        time.sleep(0.01)
def moverightlol():
    global dodo
    minescript.player_press_right(True)
    minescript.player_press_attack(True)
    while True:
        pos = minescript.player_position()
        time.sleep(0.4)
        pos2 = minescript.player_position()
        if pos == pos2:
            minescript.player_press_attack(False)
            minescript.player_press_right(False)
            dodo = "left"
            movefowardlol()
def moveleftlol():
    global dodo
    minescript.player_press_left(True)
    minescript.player_press_attack(True)
    while True:

        pos = minescript.player_position()
        time.sleep(0.4)
        pos2 = minescript.player_position()
        if pos == [37.30701198855439, 70.0, -49.30000001192093] or pos == [43.69999998807907, 70.0, -49.30000001192093] or pos == [44.69999998807907, 70.0, -238.69999998807907]:
            minescript.chat("/warp garden")
        if pos == pos2:
            minescript.player_press_attack(False)
            minescript.player_press_left(False)
            dodo = "right"
            movefowardlol()
with open("config2.txt", "w") as file:
    file.write("id=0")
while True:
    with open("config2.txt", "r") as file:
        content = file.readline()
    time.sleep(0.2)
    if content == "ms=true":
        moverightlol()
moverightlol()
        
           



s




                    
