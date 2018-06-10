(define manhattan ; valore: lista di stringhe di 0 (spostamento verticale) / 1 (spostamento orizzontale)
  (lambda (i j) ; i, j: linteri non negativi
    (cond ((and (= i 0) (= j 0))
           (list ""))
          ((= j 0)
           (list (string-append "0" (car (manhattan (- i 1) j)))))
          ((= i 0)
           (list (string-append "1" (car (manhattan i (- j 1))))))
          (else
           (append
            (map (lambda(x) (string-append "0" x))(manhattan (- i 1) j))
            (map (lambda(x) (string-append "1" x))(manhattan i (- j 1)))
            ))
          )))

(manhattan 2 2);Risultato corretto: (list "0011" "0101" "0110" "1001" "1010" "1100")
