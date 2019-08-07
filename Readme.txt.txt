Zagadou Daniella Marie-Hermance Oyotode
31321815
Project1
Lab section: MW : 12:30 to 1:45
 

To read my project, please open it with eclipse.

My program meets all the requirements of the project:
* Ask for the user inputs to get angle, speed and willingness to continue or not, until he/she quits
* Keeps track of the user's score and prints whether or not the user hits the wall

Extra credits:

1)  My program uses randomness to print the result to the user

2) The wall moves while the user is throwing the projectile. Once lanuched, the wall stop.
It calculates the maximum x the projectile can reach and if x is less than the distance obtained after the launch(The user has been crushed)
the programs prints the user failed because if did not reach the wall.
Otherwise, it use the method Game() of the class TTY to compute the y where the projectile hits the wall.

3) My program offers two options to the user:
The user should enter 1 to play, 2 to test and any other integer to quit.
The second one is a way for the user to gain the outputs of certain inputs with no moving wall.So, my program uses 
another method of the class TTY called Test(). It allows the user to test different inputs of angle, speed, distance, 
height. The method prints the output the user would have reached if it was actually launching a projectile.

4) My programs prints the average height reached by the projectile at the end of the round