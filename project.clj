(defproject exercism-api "0.1.0-SNAPSHOT"
  :description "An API for Exercism.io"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-time "0.9.0"] ; required due to bug in lein-ring
                 [metosin/compojure-api "0.22.0"]
                 [pandect "0.5.2"]
                 [environ "1.0.0"]
                 [org.clojure/java.jdbc "0.3.7"]]
  :ring {:handler exercism-api.handler/app}
  :uberjar-name "server.jar"
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [cheshire "5.3.1"]
                                  [ring-mock "0.1.5"]
                                  [midje "1.6.3"]]
                   :plugins [[lein-ring "0.9.6"]
                             [lein-midje "3.1.3"]
                             [lein-environ "1.0.0"]]}})
