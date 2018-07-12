# Path Replanning

## Overview

We have eight path replanning.

* **DE4s** -> *Differential Evolution for security* [[DE4s](./DE4s/)]

* **GH4s** -> *Greedy Heuristic for security* [[Link](http://www.worldscientific.com/doi/abs/10.1142/S0218213017600089)]

* **GA4s** -> *Genetic Algorithm for security* [[Link](http://www.worldscientific.com/doi/abs/10.1142/S0218213017600089)]

* **MPGA4s** ->  *Multi-Population Genetic Algorithm for security* [[Link](http://ieeexplore.ieee.org/document/7372174/)]

* **MS4s** -> *Multi-Start for security*

* **MILP4s** -> *Mixed Integer Linear Programming for security*

* **SGA4s** -> *Simple Genetic Algorithm for security*

* **APSTD4s** -> *Algoritmo de Pouso Sem Tomada de Decisão for security*

## To Run

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

## Input Files

* **instance-maps/In_00m.sgl** -> Map file used by the Genetic Algorithm.
* **config.sgl** -> Configuration file used by the Genetic Algorithm.
* **instance** -> Instance file used by the Genetic Algorithm.

## Output Files

* **output-simulation.log** -> file with various information generated by the Genetic Algorithm.
* **route.txt** -> file with the route found by the Genetic Algorithm.
* **sol_N.png** -> image containing the best route found by the Genetic Algorithm.

## Configurations

To change the INSTANCE MAP and CONFIG FILE, you need to change lines 211 and 212 of the instance file:

```
-----------------------<FILE>instance<FILE>-----------------------
| LINE | CONTENT                                                 |
|----------------------------------------------------------------|
|  ... | ...                                                     |
|  208 | ProOF.apl.jeezzz.problem.PPCCS.instance.InstanceProblem |
|  209 | <parameters number>                                     |
|  210 | 2                                                       |
|  211 | instance-maps/I1_000.sgl                                | <- This line represent the INSTANCE MAP
|  212 | config.sgl                                              | <- This line represent the CONFIG FILE
|  ... | ...                                                     |
------------------------------------------------------------------
```

To change the NUMBER OF POPULATIONS and NUMBER OF INDIVIDUALS, you need to change lines 105 and 106 of the instance file:

```
-----------------------<FILE>instance<FILE>-----------------------
| LINE | CONTENT                                                 |
|----------------------------------------------------------------|
|  ... | ...                                                     |
|  102 | ProOF.apl.advanced1.method.MPGA                         |
|  103 | <parameters number>                                     |
|  104 | 2                                                       |
|  105 | 3                                                       | <- This line represent the NUMBER OF POPULATIONS
|  106 | 39                                                      | <- This line represent the NUMBER OF INDIVIDUALS total (39 = 3x13)
|  107 | <node id>                                               |
|  ... | ...                                                     |
------------------------------------------------------------------
```

To change the TIME to execute the method, you need to change line 117 of the instance file:

```
-----------------------<FILE>instance<FILE>-----------------------
| LINE | CONTENT                                                 |
|----------------------------------------------------------------|
|  ... | ...                                                     |
|  114 | ProOF.gen.stopping.Time                                 |
|  115 | <parameters number>                                     |
|  116 | 1                                                       |
|  117 | 1.0                                                     | <- This line represent the TIME (in seconds)
|  118 | <node id>                                               |
|  ... | ...                                                     |
------------------------------------------------------------------
```

To change the CROSSOVER RATE and MUTATION RATE, you need to change lines 128 and 129 of the instance file:

```
-----------------------<FILE>instance<FILE>-----------------------
| LINE | CONTENT                                                 |
|----------------------------------------------------------------|
|  ... | ...                                                     |
|  125 | ProOF.apl.advanced1.FMS.population.Convergence          |
|  126 | <parameters number>                                     |
|  127 | 2                                                       |
|  128 | 0.5                                                     | <- This line represent the CROSSOVER RATE
|  129 | 0.75                                                    | <- This line represent the MUTATION RATE
|  130 | <node id>                                               |
|  ... | ...                                                     |
------------------------------------------------------------------
```

To change the NUMBER OF RAMIFICATION, you need to change line 223 of the instance file:

```
-----------------------<FILE>instance<FILE>-----------------------
| LINE | CONTENT                                                 |
|----------------------------------------------------------------|
|  ... | ...                                                     |
|  220 | ProOF.apl.advanced1.FMS.structure.Tree                  |
|  221 | <parameters number>                                     |
|  222 | 1                                                       |
|  223 | 3                                                       | <- This line represent the NUMBER OF RAMIFICATION
|  224 | <node id>                                               |
|  ... | ...                                                     |
------------------------------------------------------------------
```
