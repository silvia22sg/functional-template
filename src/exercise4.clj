(ns exercise4)
(defn summary [vector]
(def result 0)
  (doseq [n vector]
    (def result (+ n result))
  )
  (if (empty? vector) 0 result)
)