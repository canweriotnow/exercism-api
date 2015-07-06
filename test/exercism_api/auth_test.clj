(ns exercism-api.auth-test
  (:require [midje.sweet :refer :all]
            [exercism-api.auth :refer :all]
            [pandect.algo.sha1 :refer :all]))


;; TODO - Actually learn to use Midje
(facts "Exercsim auth tests"
       (fact "Var default is a String"
             (class default) => java.lang.String)
       (fact "In absence of env var, secret is the same as default"
             secret => default)
       (fact "Shared key is the SHA1 hash of secret"
             (sha1 secret) => shared-key)
       (fact "Validates identity of a key as the shared key"
             (let [key (sha1 secret)]
               (validate key) => true)))
