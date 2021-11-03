(ns minato.one.unique-string)

(defn- is-unique-with-hash-table
  "O(n) solution using hash-table"
  [chars]
  (loop [memo {}
         [head & tail] chars]
    (cond
      (= head nil)
      true

      (get memo head)
      false

      :else
      (let [mem (assoc memo head true)]
        (recur mem tail)))))

(defn- is-unique-without-additional-ds?
  "O(n*logn) solution without any additional data-structure"
  [chars]
  (let [chars (sort chars)]
    (loop [[head & tail] chars]
      (if (empty? tail)
        true
        (let [[tail-head] tail]
          (if (= head tail-head)
            false
            (recur tail)))))))

(defn is-unique?
  "Algorithm to find if all the characters in a string are unique"
  [str-var use-additional-ds]
  (if use-additional-ds
    (is-unique-with-hash-table (seq str-var))
    (is-unique-without-additional-ds? (seq str-var))))