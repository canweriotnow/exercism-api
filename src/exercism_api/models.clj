(ns exercism-api.models
  (require [schema.core :as s]))

(s/defschema Track
  {:id String
   :slug String
   :repository String
   :active Boolean})
