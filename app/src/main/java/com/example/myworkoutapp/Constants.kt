package com.example.myworkoutapp

object Constants {
    fun defaultExerciseList():ArrayList<Exercise>{
        val exerciseList=ArrayList<Exercise>()
        val jumpingsquats=Exercise(
            1,
            "Jumping Squats",
            R.drawable.jumpingsquatscropt,
            false,
            false
        )
        exerciseList.add(jumpingsquats)
        val lunges=Exercise(
            2,
            "Lunges",
            R.drawable.lungescropt,
            false,
            false
        )
        exerciseList.add(lunges)
        val plank=Exercise(
            3,
            "Plank",
            R.drawable.plankcropt,
            false,
            false
        )
        exerciseList.add(plank)
        val plankwalk=Exercise(
            4,
            "Plank Walk",
            R.drawable.plankwalkcropt,
            false,
            false
        )
        exerciseList.add(plankwalk)
        val sidelunges=Exercise(
            5,
            "Side Lunges",
            R.drawable.sidelungescropt,
            false,
            false
        )
        exerciseList.add(sidelunges)
        val sideplankcrunch=Exercise(
            6,
            "Side Plank Crunch",
            R.drawable.sideplankcrunchcropt,
            false,
            false
        )
        exerciseList.add(sideplankcrunch)
        val squattrust=Exercise(
            7,
            "Squat Thrust",
            R.drawable.squatthrustcropt,
            false,
            false
        )
        exerciseList.add(squattrust)

        return exerciseList
    }
}