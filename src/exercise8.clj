(ns exercise8)
(defn squear [x]
  (* x x)
)
(defn fderive [func delta x]
  (/ (- (apply func [(+ x delta)]) (apply func [(- x delta)])) (* 2 delta))
)