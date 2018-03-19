# Path Replanning

## Overview

We have four path replanning.

* **DE4s** -> *Differential Evolution for security*

* **GH4s** -> *Greedy Heuristic for security* [[Link](http://www.worldscientific.com/doi/abs/10.1142/S0218213017600089)]

* **GA4s** -> *Genetic Algorithm for security* [[Link](http://www.worldscientific.com/doi/abs/10.1142/S0218213017600089)]

* **MPGA4s** ->  *Multi-Population Genetic Algorithm for security* [[Link](http://ieeexplore.ieee.org/document/7372174/)]

## To Run:

Example of how to run the MPGA4s, or other planners are similar.

With plot of the route in a .png file:

```
$ cd MPGA4s
$ ./exec-replanner-plot.sh
```

Without plot of the route:

```
$ cd MPGA4s
$ ./exec-replanner.sh
```

## Configurations

To change the instance map, you need to change line 211 of the instance file:

```
--------------instance---------------
| line content                      |
|  ...                              |
|  209 <parameters number>          |
|  210 2                            |
|  211 instance-maps/I1_000.sgl     |    <- CHANGE this line
|  212 config.sgl                   |
|  ...                              |
-------------------------------------
```

```
--------------instance---------------
| line content                      |
|  ...                              |
|  209 <parameters number>          |
|  210 2                            |
|  211 instance-maps/I2_001.sgl     |    <- line CHANGED
|  212 config.sgl                   |
|  ...                              |
-------------------------------------
```
