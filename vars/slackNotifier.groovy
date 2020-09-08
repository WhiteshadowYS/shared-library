#!/usr/bin/env groovy

def call(String result) {
  if ( result == "SUCCESS" ) {
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful", color: "good"
  }
  else if ( result == "FAILURE" ) { 
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed", color: "danger"
  }
  else if ( result == "UNSTABLE" ) { 
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable", color: "warning"
  }
  else {
    slackSend message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its resulat was unclear", color: "danger"
  }
}