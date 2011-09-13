(ns euler.t_problem_three
    (:use euler.problem-three midje.sweet))

(fact
  (is-factor 4 2) => true
  (is-factor 9 3) => true
  (is-factor 9 4) => false
  (is-factor 8 10) => false
  (is-factor 8 8) => false)

(facts "about prime numbers"
  (is-prime 0) => falsey
  (is-prime 1) => falsey
  (is-prime 2) => falsey
  (is-prime 3) => truthy
  (is-prime 4) => falsey
  (is-prime 8) => falsey)

(facts "about factors"
  (factors 12) => (seq [2 3 4 6])
  (factors 13195) => (contains [5 7 13 29]))

(facts "about prime factors"
  (is-prime huge) => false
  (prime-factors 13195) => (seq [5 7 13 29])
)
