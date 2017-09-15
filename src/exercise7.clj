(ns exercise7)
(defn fnmap [f x &[newList]]
    (cond
     (empty? x) (reverse newList)
     :else  (fnmap f (rest x) (cons (apply f [(first x)]) newList ))
    )
)
(defn fmap [f x]
  (cond
     (map? x) (reduce-kv (fn [m k v](assoc m k (f v))) (empty x) x)
     :else (fnmap f x)
  )
)