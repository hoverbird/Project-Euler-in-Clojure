(ns euler.problem-three
  "The prime factors of 13195 are 5, 7, 13 and 29.
   What is the largest prime factor of the number 600851475143?")

(def huge 600851475143)
  
(defn is-factor [num factor]
  (and (> factor 1)
       (zero? (rem num factor))
       (not (= num factor))))

(defn is-prime [num]
  (and
    (> num 2)
    (< (int (Math/sqrt num)) 2)))

(defn factors [num]
  (filter (fn [i] (is-factor num i)) (range num)))

(defn prime-factors [num]
  (filter is-prime (factors num)))
