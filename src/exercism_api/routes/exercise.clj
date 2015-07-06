(ns exercism-api.routes.exercise
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [cheshire.core :as c]
            [schema.core :as s]
            [exercism-api.schema :refer :all]))

(s/defschema Dummy {:message s/Str})

(defn dummy []
  (ok (c/generate-string {:message "ok"})))

(defroutes* exercise-routes
  (GET* "/tracks" []
        :return [Track]
        :summary "Track listing"
        (dummy))
  (GET* "/track/:track-id" [track-id]
        :return Track
        :summary "Track info"
        (dummy))
  (GET* "/problems" []
        :return [Problem]
        :summary "Problem listing"
        (dummy))
  (GET* "/problems/:track-id" [track-id]
        :return [Problem]
        :summary "Problems for a specific track"
        (dummy))
  (GET* "/problems/:track-id/:slug" [track-id slug]
        :return Problem
        :summary "Single problem within a track"
        (dummy)))
