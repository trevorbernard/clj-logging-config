(defproject clj-logging-config "1.9.11-SNAPSHOT"
  :description "Log configuation for Clojure"
  :url "https://github.com/malcolmsparks/clj-logging-config"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [log4j/log4j "1.2.16"]]
  :min-lein-version "2.0.0"
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :pom-addition [:developers
                 [:developer
                  [:name "Malcolm Sparks"]
                  [:email "malcolm@congreve.com"]
                  [:url "http://blog.malcolmsparks.com"]
                  [:timezone "London/Europe"]]])
