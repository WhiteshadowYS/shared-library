#!/usr/bin/env groovy

def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful", color: "good"
  }
  else if ( buildResult == "FAILURE" ) { 
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed", color: "danger"
  }
  else if ( buildResult == "UNSTABLE" ) { 
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable", color: "warning"
  }
  else {
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its resulat was unclear", color: "danger"
  }
}