(ns exercism-api.core
  (:require [org.httpkit.server :as http-kit]
            [exercism-api.handler :refer [app]]
            [ring.middleware.reload :refer [wrap-reload]]
            [ring.middleware.json :refer [wrap-json-response]]))

(defn dev? [args] (some #{"-dev"} args))

(defn -main [& args]
  (http-kit/run-server
   (-> app
       wrap-json-response
       wrap-reload)
   {:port 8080})
  (println "server started"))
