(ns euler.t_problem_three
    (:use euler.problem_three 
            clojure.test
            midje.sweet))

(fact
  (is-factor 4 2) => true)
