(ns exercism-api.schema
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

(s/defschema Comment
  ;; STUB
  {:id s/Integer
   :user_id s/Num
   :submission_id s/Num
   :body s/Str
   :html_body s/Str
   })

(s/defschema Submission
  ;; STUB
  {:id s/Num
   :user_id s/Num
   :key s/Str

   :state s/Str
   :language s/Str
   :slug s/Str
   :code s/Str
   :done_at (s/maybe java.util.Date) ;; Should expand acceptable dt types
   :is_liked s/Bool
   :nit_count s/Num
   :version s/Num
   :user_exercise_id s/Num
   :filename s/Str
   })


(s/defschema User
  ;;STUB
  {:id s/Num
   :username s/Str
   :email s/Str ;; TODO Email validation
   :avatar_url s/Str ;; TODO URI validation
   :github_id s/Num
   :key s/Str

   :mastery s/Str})

(s/defschema Team
  ;; STUB
  {:id s/Num
   :creator_id s/Num
   :slug s/Str
   :name s/Str})
