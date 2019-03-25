import hudson.model.Result
import jenkins.model.CauseOfInterruption.UserInterruption

// from https://stackoverflow.com/questions/40760716/jenkins-abort-running-build-if-new-one-is-started

def killOldBuilds() {
  while(currentBuild.rawBuild.getPreviousBuildInProgress() != null) {
    currentBuild.rawBuild.getPreviousBuildInProgress().doTerm()
    //.doKill()
  }
}
