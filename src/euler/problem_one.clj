(ns euler.problem-one
  "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.")

(def a-thousand (range 1000))

(defn divisible-by-5-or-3 [number]
  (or
    (zero? (rem number 5))
    (zero? (rem number 3))))

(print (reduce + (filter divisible-by-5-or-3 a-thousand)))