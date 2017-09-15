(ns exercise3)
(defn only-greater-than-five [x]
    (cond
      (= x 0) 0
      (= x 1) 1
      :else (+ (only-greater-than-five (- x 1)) (only-greater-than-five (- x 2)))
    )
)