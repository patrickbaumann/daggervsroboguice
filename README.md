Summary
=======

This project was created to compare start and injection times required to support dependency injection with both the RoboGuice and dagger DI libraries. 

BaseProject
-----------
One base project defines 30 interfaces and 29 implementations, each injecting the next. This leads to a linear chain of dependencies, 30 classes deep. At this time there are no circular dependencies or other complexities in the dependency tree. The 30th implementation is left for consumers to define, though the dependent implementation requests injection from the base project.

Dagger & RoboGuice Projects
---------------------------
The other two projects are implemented with the same functionality using different DI libraries. RoboTest uses RoboGuice 2.0 and Dagger uses the latest dagger implementation.

Build it
=======

Prerequisites
-------------
Java JDK 1.6+
maven 3+
Android SDK 16+
git

Build dagger
------------
`git clone git://github.com/square/dagger.git`

`cd dagger`

`mvn install`

Build BaseProject
-----------------
from BaseProject, run
`mvn install`

Build RoboTest
--------------
from RoboTest, run
`mvn install`

Deploy to a connected device with `mvn android:deploy`

Build DaggerTest
----------------
from DaggerTest, run
`mvn install`

Deploy to a connected device with `mvn android:deploy`

Results
=======
RoboGuice, as expected, has a larger start up cost due to its run-time module executing and binding validation. Dagger does its validation at compile time, removing nearly all of that cost at start up.

Running the built APKs from this source gets the following results:
* DaggerTest: 62ms average start up time with 16 runs.
* RoboTest: 403ms average start up time with 16 runs.

I'll attempt to do additional profiling of where that time is being spent in each project, but the initial results are exciting to say the least.
