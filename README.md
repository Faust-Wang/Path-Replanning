# Path Replanning

To Run:

	With plot of the route in a .png file:
		$ ./exec-mpga4s-plot.sh

	Without plot of the route:
		$ ./exec-mpga4s.sh

To change the instance map, you need to change line 211 of the instance file:

--------------instance--------------
| 209 <parameters number>          |
| 210 2                            |
| 211 instance-maps/I1_000.sgl     |    <- CHANGE this line
| 212 config.sgl                   |
------------------------------------

--------------instance--------------
| 209 <parameters number>          |
| 210 2                            |
| 211 instance-maps/I2_001.sgl     |    <- line CHANGED
| 212 config.sgl                   |
------------------------------------
