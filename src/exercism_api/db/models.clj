(ns exercism-api.db.models
  (:require [korma.db :refer :all]))

;; Obviously, change all this to environ before prod
(defdb exercism-dev
  (postgres {:db "exercism"
             :user "exercism"
             :password "exercism"
             :host "localhost"
             :port "5432"}))

(declare users submissions)

(defentity users
  (has-many submissions))

(defentity submissions
  (belongs-to users))
