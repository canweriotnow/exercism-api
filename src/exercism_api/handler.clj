(ns exercism-api.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [schema.core :as s]
            [exercism-api.routes.exercise :refer [exercise-routes]]
            [exercism-api.routes.submission :refer [submission-routes]]))

(s/defschema Message {:message String})

(defapi app
  {:formats :json-kw}
  (swagger-ui)
  (swagger-docs
    {:info {:title "Exercism API"
            :description "API for Exercism.io"}
     :tags [{:name "hello", :description "says hello in Finnish"}]})
  (context* "/v1/e" []
            :tags ["Exercism API V1"]
            submission-routes)
  (context* "/v1/x" []
    :tags ["Exercism X-API V1"]
    exercise-routes
    (GET* "/" []
      :return Message
      :query-params [name :- String]
      :summary "say hello"
      (ok {:message (str "Terve, " name)}))))
