import minescript
import time
import asyncio
pos = minescript.player_position()
pos2 = minescript.player_position()
def pos():
    global pos
    global pos2
    pos = minescript.player_position()
    pos2 = minescript.player_position()
def movefowardlol(pos2, pos):
    minescript.echo("please be working")
    minescript.player_press_forward(True)
    while True:
        if pos2 == pos:
            minescript.player_press_forward(False)
            break
        time.sleep(0.01)
def moverightlol(pos2, pos):
    minescript.echo("please be working")
    minescript.player_press_right(True)
    minescript.player_press_attack(True)
    while true:
        pos()
        if pos == pos2:
            minescript.echo("please be working")
            minescript.player_press_attack(False)
            minescript.player_press_right(False)
            movefowardLol(pos2, pos)
            break:
        time.sleep(0.1)
moverightlol(pos2, pos)
        
            
