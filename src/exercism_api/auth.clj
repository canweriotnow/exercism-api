(ns exercism-api.auth
  (:require [pandect.algo.sha1 :refer :all]
            [environ.core :refer [env]]))

;; Based on Exercism::Rikki from exercism/exercism.io
;; Subject to change, just working on reproducing
;; existing functionality. Should probalby switch
;; to SHA-256 instead of SHA-1

(def ^:dynamic default
  "I wish a robot would get elected president.
  That way, when he came to town, we could all
  take a shot at him and not feel too bad.")

(def ^:dynamic secret
  (or (env :rikki-secret) default))

(def ^:dynamic shared-key
  (sha1 secret))

(defn validate [key]
  (= key shared-key))
