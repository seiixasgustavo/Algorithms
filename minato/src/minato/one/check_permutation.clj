(ns minato.one.check-permutation)

(defn inc-or-on
  [chars-table key]
  (if (get chars-table key)
    (inc (get chars-table key))
    1))

(defn create-str-hash-table
  [str-var]
  (let [str-seq (seq str-var)]
    (loop [[head & tail] str-seq
           memo {}]
      (if (nil? head)
        memo
        (recur tail (assoc memo
                      head
                      (inc-or-on memo head)))))))

(defn check-permutation
  ""
  [str1 str2])