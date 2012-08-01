(defproject lein-junit "1.0.4-SNAPSHOT"
  :author "Caspar Florian Ebeling, Roman Scherer"
  :description "JUnit plugin for Leiningen"
  :url "http://github.com/febeling/lein-junit"
  :min-lein-version "2.0.0"
  :dependencies [[org.apache.ant/ant-junit "1.8.4"]
                 [org.apache.ant/ant-junit4 "1.8.4"]
                 [lancet "1.0.2-SNAPSHOT"]
                 [junit/junit "4.10"]]
  :eval-in-leiningen true)
