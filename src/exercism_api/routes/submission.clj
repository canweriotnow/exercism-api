(ns exercism-api.routes.submission
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [cheshire.core :as c]
            [schema.core :as s]
            [exercism-api.schema :refer :all]))

(s/defschema Dummy {:message s/Str})

(defn dummy []
  (ok (c/generate-string {:message "ok"})))

(defroutes* submission-routes
  (GET* "/problems" []
        :return [Problem]
        :summary "Problem listing"
        :query-params [key :- String]
        (dummy)))
