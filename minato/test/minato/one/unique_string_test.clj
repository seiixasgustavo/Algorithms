(ns minato.one.unique-string-test
  (:require [midje.sweet :refer [=> fact facts]]
            [minato.one.unique-string :refer [is-unique?]]))

(facts "Test for is unique string without additional data structure"
  (fact "Should be false"
    (is-unique? "aaaa" false) => false)
  (fact "Should be true"
    (is-unique? "dasvcxopu104" false) => true))

(facts "Test for is-unique string with additional data structure"
  (fact "Should be false"
    (is-unique? "aaaa" true) => false)
  (fact "Should be true"
    (is-unique? "dasvcxopu104" true) => true))