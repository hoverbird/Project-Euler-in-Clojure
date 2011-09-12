(ns euler.problem_three
  "The prime factors of 13195 are 5, 7, 13 and 29.
   What is the largest prime factor of the number 600851475143?")

(def huge 600851475143)

(defn is-factor [num factor]
  (zero? (rem num factor)))

; (defn is-prime [num]
;   (let [factors []]
;     loop ))
  
(defn factorial [n]
  (reduce * (range 1 (inc n))))