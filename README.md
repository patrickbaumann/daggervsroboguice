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

Additional profiling found that setContentView takes ~35ms for both applications with onCreate using up the remaining time. So operating under the assumption that onCreate is *only* spending time instantiating and providing / injecting objects:
* dagger: ~25ms
* RoboGuice: ~365ms

Disclaimer
=========
Keep in mind that RoboGuice is preparing itself to provide much more than the 30 classes we've defined for this test (services, contexts, etc.), so this isn't quite an apples to apples test; more of an apple pie to apples comparison. Perhaps a Guice vs. Dagger comparison would be more apt, but until we have a RoboDagger (sounds painful), this will have to suffice. That said, I've done profiling of RoboGuice and its initialization cold start is a direct result of its use of Guice. That 400ms startup cost can be traced to Guice's module execution and binding validation, not the RoboGuice code that wraps it.
