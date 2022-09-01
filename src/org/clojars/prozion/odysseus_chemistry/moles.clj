(ns org.clojars.prozion.odysseus-chemistry.moles
  (:require [clojure.string :as s]
            [org.clojars.prozion.odysseus-chemistry.constants :refer :all]
            [org.clojars.prozion.odysseus.utils :refer :all]
            [org.clojars.prozion.odysseus.debug :refer :all]
            ))

(defn get-standard-atomic-weight [atom]
  (let [m (get-in PTM [(keyword atom) :m] 0)]
    m))

; (get-molecular-mass 'C2-H5-O-H
; SMILES: CC(=O)OH
(defn get-molecular-mass [formula]
  (let [formula (name formula)
        atom-ratios (s/split formula #"-")
        atom-ratios (map (fn [expr]
                            (let [[_ atom ratio] (re-matches #"([A-Z]+)(\d+)?" expr)]
                              [atom ratio]))
                          atom-ratios)]
    (reduce
      (fn [acc [atom ratio]]
          (+ acc (* (get-standard-atomic-weight atom) (->integer (or ratio 1)))))
      0
      atom-ratios)))
