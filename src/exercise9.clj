(ns exercise9)
(defn things [elem]
  (cond 
        (map? elem) (println "Soy un mapa")
        (vector? elem) (println "Soy un Vector")
        (string? elem) (println "Soy un String")
        :else (println "Soy un default")
  )
)