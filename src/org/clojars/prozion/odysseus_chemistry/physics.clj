(ns org.clojars.prozion.odysseus-chemistry.physics
  (:require [clojure.string :as s]
            [org.clojars.prozion.odysseus-chemistry.constants :refer :all]
            [org.clojars.prozion.odysseus.debug :refer :all]
            ))

(defn C->K [C]
  (+ C 273.15))

(defn K->C [K]
  (- K 273.15))

(defn C->F [C]
  (+ (* C 9/5) 32.0))

(defn F->C [F]
  (* 5/9 (- F 32.0)))
