(ns exercise2)
(defn only-greater-than-five [list &[newList]]
  (cond 
    (empty? list) (reverse newList)
    :else (if (<= (first list) 5 ) 
             (only-greater-than-five (rest list) newList)
             (only-greater-than-five (rest list) (cons (first list) newList))
          )
  )                                                      
)