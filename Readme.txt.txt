

*Clubs is class taking the club number and the power as parameter. The club number allows to get the mean and the standard debiation of the distance via the method
gethitInfo() in order to compute the distance travelled in the method nextDistance(mean, stddeviation, power)

*Course is a class that help to determine the name, length of the hole and par of that hole by entering the number chosen by the user in the main class.

*Putting takes into parameters the power, then find the corresponing mean and standard deviation of that power in the method getPuttInfo() and compute the next 
distance to the hole in the method nextDistance(mean, stddeviation)

*Scores takes the par and the score as parametters and converts them into the corresponding name in the game golf via the method determineName(par, score);

*TTY takes into parameter variables of type Course, Score, Putting and Clubs . The most important method of that class is Implementation() as it help implementing
 the actual game in the following order:

          1) Ask the user to choose his course or quit 
          2) Implement the game 18 (or the number of time the user wants that is less than 18) times with the help of a for loop
          3) Change the final integer score to its corresponding name in a normal game
          4) Prints final outputs
         All of those steps are in a while loop to allow the user to play as many round as he wants by entering Y

         *Extra Credits:
                   1) Use of strange terminology to describe scores
                   2) Allowing users to quit at any time

* The Main class just call these different methods and run.
