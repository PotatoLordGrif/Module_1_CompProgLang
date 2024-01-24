print_area_of_circle(Radius) :-
    Area is 3.14 * Radius * Radius,
    format('The area of the circle with radius ~w is ~w~n', [Radius, Area]).