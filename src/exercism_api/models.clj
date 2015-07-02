(ns exercism-api.models
  (require [schema.core :as s]))

(s/defschema Track
  {:id s/Str
   :slug s/Str
   :repository s/Str
   :language s/Str
   :active s/Bool
   :problems [s/Str]})

(s/defschema Problem
  {:id s/Str
   :language s/Str
   :track_id s/Str
   :name s/Str
   :slug s/Str
   :files {
           ;; TODO
           }
   :fresh s/Bool})
