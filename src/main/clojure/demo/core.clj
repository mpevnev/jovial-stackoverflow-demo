(ns demo.core)

(defmacro infinite-fns
  [prefix n]
  `(do
     ~@(map
         (fn [i] `(defn ~(symbol (str prefix "-" i)) [] ~i))
         (range n))))

(infinite-fns "f" 2000)
