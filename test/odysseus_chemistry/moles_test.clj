(ns odysseus-chemistry.moles-test
  (:require [clojure.test :refer :all]
            [org.clojars.prozion.odysseus.test :refer :all]
            [org.clojars.prozion.odysseus-chemistry.moles :refer :all]))

(deftest get-molecular-mass-test
  (testing "test get-molecular-mass function"
    (is (=* (get-molecular-mass 'C2-H5-O-H) 46.068 0.01))))
