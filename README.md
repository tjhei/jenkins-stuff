# jenkins-stuff

This repo provides stuff we use in our Jenkins instance. This includes:

## killold library

Provides a utility function to be used inside a Jenkins pipeline to kill all older jobs in the same PR. Usage:

```

// load library https://github.com/tjhei/jenkins-stuff to provide
// killold.killOldBuilds() function:
@Library('tjhei') _


// somewhere in the beginning:
 stage("abort old")
    {
      agent none
      steps
      {
        script { killold.killOldBuilds() }
      }
    }
```

To register the library go to:
1. "manage jenkins"
2. "configure system"
3. add a library under "Global Pipeline Libraries"
4. name: tjhei, version: master, repo: https://github.com/tjhei/jenkins-stuff
