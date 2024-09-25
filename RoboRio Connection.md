# Working with RoboRio V2

## FRC Driver Station

1. Open FRC Driver Station (2 windows should open, focus on the smaller one that has a battery icon in the center).
2. Connect the roboRIO to computer via internet or cable
3. Go to settings (3rd icon on the left side).
4. Under "Team Number", type in our team number (10004).
5. Go to status (2nd icon on the left side), you should see the volt number next to the battery, the battery and the box next to "Communications" should also turn green.
6. Click on the refresh icon near the left side, you should then see a new line called "Robot (10.100.4.2)" appearing on the list below with a green dot next to it.
7. If all of step 5 and 6 are true, you are connected to the roboRIO

  
     
         
         

# Assigning CAN Bus Device IDs

## SparkMax
1. Open REV Hardware Client.
2. Connect the SparkMax to the computer.
3. Click on the refresh icon at the center of the REV Hardware Client menu or "Scan For Devices" at the bottom left corner.
4. After the SparkMax shows up, disconnect the SparkMax and repeat for the next one, you should still be able to see the SparkMax you previously connected even after disconnecting.

## Kraken:
1. Open Phoenix Tuner X.
2. Connect the roboRIO to computer via either internet or cable.
3. On the left-hand menu in Phoenix Tuner X, choose either localhost or roboRIO USB depending on connection type from step 2.
4. Click on "Run Temporary Diagnostics" at the center of the screen. The 4 kraken drives should show up.