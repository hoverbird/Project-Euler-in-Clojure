(ns euler.t_problem_three
    (:use euler.problem-three midje.sweet))

(facts "about prime numbers"
  (is-prime 0) => falsey
  (is-prime 1) => falsey
  (is-prime 2) => falsey
  (is-prime 3) => truthy
  (is-prime 4) => falsey
  (is-prime 8) => falsey
  (is-prime 13) => truthy
  (is-prime 29) => truthy)

(facts "about what is and is not a factor of a number"
  (is-factor 4 2) => true
  (is-factor 9 3) => true
  (is-factor 9 4) => false
  (is-factor 8 10) => false
  (is-factor 8 8) => false)

(facts "about a number's factors"
  (factors 12) => (seq [2 3 4 6])
  (factors 13195) => (contains [5 7 13 29]))

(facts "about prime factors"
  (is-prime huge) => false
  (prime-factors 25) => (contains [5])
  (prime-factors 13195) => (contains [5 7 13 29]))
