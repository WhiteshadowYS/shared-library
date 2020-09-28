#!/usr/bin/env groovy

def call(String txt, String str) {
  if (txt.contains(str)) {
      return "true"
  } else {
      return "false"
  }
}